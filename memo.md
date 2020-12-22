# 鯖設定
## コンパイル準備
VisualStudioは入手できなさそう＆入手してもライセンス配布が終了しているのでBorlandCompilerを入手する  
たぶんポータブル版が手に入るので適当な場所に置く  
チェックインしている設定は`C:\Users\Admin\Documents\tool\BCC102`に置いた想定  

## コンパイルバッチファイル修正
* `bcc32_make.bat`を開いて`set PATH`から始まるところを修正  
* `set __PACKETDEF__=-DPACKETVER=`から始まるところをクライアントに合わせて変更する  
チェックインしている設定は`2017-06-14bRagexeRE.exe`の使用前提で`20170614`に変更  
ドラムを使用するならAurigaがサポートしている範囲で比較的新しいものを使用する必要あり  
* `bcc32`となっている箇所を`bcc32c`に変更する  
* `:set __ZLIB__=-DLOCALZLIB`のコメントアウト`:`をはずす  
* cgiでアカウント登録する場合は`set __NO_HTTPD__=-DNO_HTTPD`をコメントアウトする


## コンパイル準備

鯖で使用するgrfファイルを指定する  
`conf\grf-files.txt`に指定  
チェックインされているものはexeと同じ階層に`grf`フォルダを作成し、その中に`data.grf`と`rdata.grf`を入れる設定  
備考  
最新の蔵データでは`data.grf`のデータでは読み込みに失敗する  
多分暗号化されている？(SecureGRFフォーマット？)  
それともファイルサイズが大きくて読み込めない？要検証  
[GRF Editor](https://drive.google.com/file/d/1Q_AVmy-qt8M6r0m-8ZLD81ffSp6UY3tD/view?usp=sharing)でGRFのバージョンを変えたり、複合化してみたものを指定してもだめだった  
MAPデータだけ抜き出しておけば問題なさそう？  
これも要検証  

## コンパイル＆起動
`bcc32_make.bat`でコンパイルし、エラーが発生していなければ`win32_start.bat`で起動する  

## 停止
GM垢でログインして`@maintenance 1`でメンテナンス状態にする(必要？)  
先に監視ウィンドウを閉じる  
その後に各exeのウィンドウで`Ctrl+C`を押して終了する

---

## Visual Studio Communityの利用(テキストモード)

* 環境変数にCL.exeがあるパスを追加  
`C:\setup\Microsoft Visual Studio\2019\Community\VC\Tools\MSVC\14.24.28314\bin\Hostx64\x64`
* プロジェクトのプロパティで`C/C++`->`全てのオプション`を選択しパケットバージョンを設定する  
* プロジェクトのプロパティで`VC++ディレクトリ`の`ライブラリディレクトリ`に`C:\setup\Microsoft Visual Studio\2019\Community\VC\Tools\MSVC\14.24.28314\lib\x64;C:\Program Files (x86)\Windows Kits\10\Lib\10.0.18362.0\ucrt\x64;`を追加する  
* `全般`の`出力ディレクトリ`を`$(SolutionDir)..\`にする  
* セーブデータをMySQL使用しない場合は`C/C++`->`全てのオプション`に`TXT_ONLY`を追加し、`リンカー`->`入力`からMySQLのライブラリを削除する  
プロジェクト設定からMySQL専用のファイルを除外してTxt専用のファイルを代わりに追加する

---

# 蔵設定
## 蔵作成
NEMOを使用する  
基本は推奨されているものを当てればよい  
ただし下記設定注意
* `Use Ascii on All LangTypes`は無効にする(他サイト情報、本当にオフがよいかは未検証)  
* `Disable Packet Encryption`は有効にする(有効にしないとAurigaがパケット処理をできず、ログインできない)  
* `Increse Headgear ViewID`も増やしておいた方がよい  
`accessoryid.lub`と`accname.lub`を設定してもオリジナル装備作成時にspr/act読み込みエラーが発生したらこれが原因  

## 接続先変更
`clientinfo.xml`を抽出して`address`を編集するGRF Editorなら編集済みのファイルをドロップしてセーブすれば更新可能    
オフライン接続なら`127.0.0.1`にして上書き  

## その他

多分これだけだと起動時に色々エラーがでる  
大体以下の対応をとる
1. 足りないのがテクスチャ等  
たぶんjROとkROの差でテクスチャが存在していない  
なのでエラーメッセージをみてkROのフルクライアントからデータを抜き出す  
まずはdataフォルダーに抜き出したファイルを置いてみてエラーが無くなるか確認し、問題なさそうだったらgrfファイルに追加する  
2. 足りないのがluaファイル  
下記のようなサイトからもってくる  
https://github.com/zackdreaver/ROenglishRE  
すでに動作している日本のエミュ鯖からもってくるのも手  
3. オリジナルグラを設定できるMOBIDは1000-3999まで  
4000以降を使用する場合はmob_avail.txtを使用しないとポリン表示になり攻撃できない  
4. ItemMoveInfoV5.txtで蔵が側で表示するアイテム制限を設定可能  
5. アイテムIDによってはスロットが表示されない  
iteminfo.lub以外のどこで設定されているのかわからず原因は不明  

### パッチ対応
1. パッチャーでThorを使用する場合は、データフォーマットを0x300にしておかないと、うまくマージが出来ない  

### 肩装備追加
本鯖にある肩装備追加時は以下のファイルに設定を追加  
`idnum2itemdisplaynametable.txt`でID検索  
→`idnum2itemresnametable.txt`でリソース名検索  
* data\luafiles514\lua files\datainfo\spriterobeid.lub  
IDを振る
* data\luafiles514\lua files\datainfo\spriterobename.lub  
ファイル名を追加
* data\luafiles514\lua files\transparentItem\transparentItem.lub  
IDに対応した設定行を設定

### マップ追加
#### クライアント
* data\mapnametable.txt
* data\mapobjlighttable.txt
* data\mp3nametable.txt
* data\resnametable.txt（コピーマップの時のみ）

#### サーバー
* `conf\maps_athena.conf`
* `db\map_index.txt`
* WeeMapCacheでマップキャッシュに追加する

---

# アカウント作成

HTTPDとCGIを有効化しておけばブラウザからアカウント作成可能  
鯖機から作成する場合はデフォルトポートなら  
http://127.0.0.1:6900/account  
チェックインしてあるものはBuffaloポートを変更しているので  
http://127.0.0.1:64704/account  
ポートは`login_port`で指定している  

---

# その他
## lubファイル
`data.grf`から抽出したlubファイルはluaファイルをコンパイルしたものなので、そのままだと内容が確認できない  
luadecを使用してデコンパイルすればよい  
luadec.exeに下記のようなbatファイルをおいておけば、lubファイルをbatにドロップするだけで変換できて楽  
```
cd /d %~dp0
:loop
if "%~1" == "" goto end
luadec %1 > "%~1.lua"
shift
goto loop
:end
```