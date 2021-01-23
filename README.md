# Private Server
## 1. 規約
* 1人1アカウントまで。  
(ログボやMD報酬は1アカウント前提で考えている為、複数アカウントで取得されるとバランス調整が難しくなるので)  
* バグや明らかにバランスがおかしいものを見つけたらすぐに報告すること。  
悪用と判断した場合はアイテムリセットorキャラリセットもあり得ます。  
* クライアントの改変(sprite入れ替え等)は自己責任でしてもかまいません。  
ただし、その場合は重力エラー等の不具合が発生してもこちらから原因を探るのができないので、フリーズやエラー表示が発生しても一切質問しないでください。  

## 2. 接続方法
### 2.1 クライアント準備
1. 別途連絡のクライアント一式をダウンロードして解凍する  
2. `VanillaLikePatcher.exe`を右クリックしてプロパティを開く  
`VanillaLikePatcher_Local.exe`は管理人用なので無視して下さい  
3. `互換性`タブから`管理者としてこのプログラムを実行する`にチェックを付ける
4. `VanillaLikePatcher.exe`を実行する
5. お好みでdataフォルダにあるカード巨大化パッチを解凍する

### 2.2 アカウント作成方法
ログイン画面から作成できます  
男アカウントを作成したい場合はアカウント名に`(作成したいアカウント名)_M`を、  
女アカウントを作成したい場合はアカウント名に`(作成したいアカウント名)_F`を、  
パスワードに設定したいパスワードを入力してログインを選択するとアカウントが作成されます。  
2度目以降のログインは、アカウント名に`_M`、`_F`を**含めずに**ログインしてください  

## 3. 仕様

<details>
  <summary>一覧</summary>

| サーバー仕様 | 設定値 |
| --- | --- |
| Exp倍率 | 25倍 |
| クエストExp倍率 | 75倍 |
| LV差によるExpペナルティ | 無し |
| 収集品アイテム | 20倍 |
| 回復アイテム | 100倍 |
| 消耗品アイテム | 50倍 |
| 装備アイテム | 30倍 |
| カードアイテム | 300倍 |
| カード効果ドロップアイテム | 50倍 |
| LV差によるドロップ率ペナルティ | 無し |
| 一般モンスターPOP数 | 1.25倍 |
| モンスター沸き時間 | 即湧き |
| スキルツリー | 制限なし |
| ASPD上限 | 196 |
| ステータス上限 | 150 |
| 詠唱時間計算方式 | RR(韓国リニューアル前) |
| 変動無詠唱 | Dex * 2 + Int >= 530 |
| 矢・弾丸消費 | 無し |
| インベントリ数 | 200 |
| 最大アイテム重量 | 2倍 |
| 開放コマンド(※1) | @commands |
|  | @go |
|  | @load |
|  | @mobinfo |
|  | @whodrops |
|  | @iteminfo |
|  | @identify |
|  | @al(@autoloot) |
|  | @alid(@autolootid/@alootid) |
|  | @alt(@autoloottype/@aloottype) |
|  | @als(@autolootstack/@alootstack) |
|  | @alp(@autolootprivate/@alootprivate) |
|  | @autopot |
| 転生 | 無し(※2) |
| ステータス/スキルリセット | 合計5回まで可能 |

※1 コマンド名だけうつと説明が表示されます  
※2 ベネット右上の転職NPCを利用すると、ノービスから直接転生1次職に転職できます。  

</details>

初期アイテムに、World Tour Ticket(メニューのワールドマップから移動する際に必要なアイテム)を所持しています。  
一部ポタ子のメニューにないものは、ワールドマップ→Navigation Windowの`MOVEボタン`→`Use World Tour Ticket`から移動できないか試してみてください

スキル(ギルドスキル含む)はiRO準拠です。
ギルド倉庫を使するには、`ギルド倉庫拡`を取得する必要があります。  
前提スキル含めて以下のスキルを取得してください。  
<details>
  <summary>ギルド倉庫使用の為の必要ギルドスキル</summary>

| スキル名 | Lv |
| --- | --- |
| 正規ギルド承認 | 1 |
| ガーディアン研究 | 1 |
| ギルド拡張 | 10 |
| 偉大なる指導力 | 1 |
| 栄光の傷 | 1 |
| 冷静な心 | 1 |
| 鋭い視線 | 1 |
| 臨戦態勢 | 1 |
| 激励 | 1 |
| 緊急招集 | 1 |
| ギルド倉庫拡張 | 1～5 |

</details>

## 4. オリジナル仕様
### 4.1 成長システム
モンスターを倒した際に確率でステータスが上がったりスキルポイントを取得することがあります。  
ステータスの成長確率はモンスターとプレイヤーのLV差とMVPモンスターかどうかによって決定します。  

|| モンスターLV - プレイヤーLV | 確率 |
| --- | --- | --- |
| MVP以外 | -80以下 | 2.0% |
|  | -80 ～ -20 | 変動 | 
|  | -20以上 | 4.0% | 
| MVP | -80以下 | 12.0% |
|  | -80 ～ -20 | 変動 | 
|  | -20以上 | 24.0% | 

ステータスの成長傾向は、初期設定で全ステータス同じになっており、ベネット右上の怪しい生物に話して変更することも出来ます。  
また、ステータスが上限に達した後に該当するステータスの成長が抽選された場合、他のステータス成長への再抽選は行われず、ステータス成長の機会が無駄になります。  
その為、特定のステータスが上限に達した後は、上限に達していないステータスが成長しやすい成長傾向に変更することをお勧めします。

スキルポイントの取得確率は固定で0.75%です。

<span style="color: red; ">成長システムに関しては、バランスが悪ければ今後確率を変更する可能性があります</span>

### 4.2 アイテム
#### 4.2.1 オリジナル武器
デパート右のNPCから初心者用武器を購入可能です。  
初心者用武器は、スターターパック武器を+9に精錬したもののおよそ半分の性能になっています。  

#### 4.2.2 防具
#### 4.2.3 エンチャント

<details>
  <summary>オリジナルエンチャント</summary>

ベネット室内NPC入ってカプラ右側にいるNPCから、シャドウ装備にいくつかのエンチャントを可能です。  
ソロプレイの難易度調整を目的としており、効果は変更する可能性があります。  

| 部位 | 効果 |
| --- | --- |
| シャドウウェポン | サイズ補正100% |
|  | ジェム消費無し |
|  | 魔導ギア燃料無し |
|  | 固定詠唱 - 70% |
|  | 固定詠唱 - 100% |
|  | 魔導ギア燃料無し |
| シャドウシールド | 反射被ダメ-100% |
| シャドウシューズ | 移動速度アップ |
| シャドウアクセ右 | OC/DC Lv10取得 |

</details>

<details>
  <summary>スペシャルエンチャント</summary>

ベネット室内NPC左側のWPの先にいるNPCから、一部装備のスペシャルエンチャントを可能です。  
スペシャルエンチャントで必要になるアイテムは、MDのクリア報酬等で入手可能です。  
また、スターター装備のエンチャントもスペシャルエンチャントNPCで可能です。  

| 部位 | 効果 |
| --- | --- |
| 上段 | ガーデンオブエデン |
|  | リス耳フード帽 |
|  | 剛勇無双の紋帽子 |
| 中段 | 浮遊する太極玉 |
| 鎧 | ドレイクコート |
| 盾 | フェザーシールド |
|  | ハルワタート |
| 肩 | 連合軍司令官のマント |
|  | フェアリーオブエデン |
|  | ヴァルキリーシールド |
| 靴 | 闇御津羽神靴 |
|  | 思念体シューズ各種 |
| アクセ | ポルックスリング |
|  | プロキオンリング |

</details>

<details>
  <summary>イリュージョンエンチャント</summary>

ベネット室内入って右上の小部屋にいるNPCから、エンチャントが可能です。  
iRO仕様なのでエンチャントできる装備や効果、必要な素材数が異なります。  
jROで対応している装備や効果で追加要望があれば、GMに言ってください。  

</details>

<details>
  <summary>エクセリオンエンチャント</summary>

ベネット室内入って左上の小部屋にいるNPCから、エンチャント素材の設計図入手や、エンチャントが可能です。  
設計図の交換にはチャールストン工場で入手できる収集品や、キャッシュポイントが必要になります。  

</details>

<details>
  <summary>イルシオンエンチャント</summary>

ベネット室内入って右上の小部屋にいるNPCから、エンチャントが可能です。  
設計図の交換には、キャッシュポイントが必要になります。  

</details>

<details>
  <summary>白の騎士団エンチャント</summary>

ベネット室内NPC左側のWPの先にいるNPCからエンチャント可能です。  

</details>

モーラエンチャント等も現地にNPCがいると思いますけれど、GM未確認です。  
要望等あれば連絡してください。  

#### 4.2.4 ランダムオプション

大罪武器改造装置による、ランダムオプションに対応しています。  
大罪武器改造装置はベネット室内のNPCでバルミールチケットと交換可能で、バルミールチケットはMVP部屋の報酬で取得可能です。  

#### 4.2.5 消耗品

* 非消耗化アイテム  
キャッシュショップから購入可能です  
ハエの羽/巨大なハエの羽/イグドラシルの葉/バーサークポーション/濃縮サラマインジュース/凸面鏡  
* 報酬箱I/II/III  
ポタ子の選択肢が日本語になっているMDのクリア報酬で獲得できます  
開けるとゼニー貨幣やキャッシュポイントチケットを入手でます  

### 4.3 ドロップ変更点

ドロップ率は`@mobinfo`で確認してください。  

<details>
  <summary>中ボス・一般</summary>

| モンスター | 変更タイプ | アイテム |
|---|---|---|
| エンジェリング | 追加 | 裁きの靴 |
| ランドグリスゴースト | 追加 | ヴァルハラアイドル |
| セイレン=ウィンザー | 削除 | 囚人の腕輪 |
|  | 追加 | 天秤宮のダイアデム |
|  | 追加 | 天秤宮のメイル |
| エレメス=ガイル | 削除 | 研究記録 |
|  | 追加 | 天蝎宮のクラウン |
|  | 追加 | 天蝎宮のメイル |
| マーガレッタ=ソリン | 追加 | 研究記録 |
|  | 追加 | 処女宮の宝冠 |
|  | 追加 | 処女宮のメイル |
| カトリーヌ=ケイロン | 削除 | 亡者の冷気 |
|  | 追加 | 宝瓶宮のクラウン |
|  | 追加 | 宝瓶宮のメイル |
| セシル=ディモン | 削除 | 囚人の腕輪 |
|  | 追加 | 人馬宮の王冠 |
|  | 追加 | 人馬宮のメイル |
| ハワード=アルトアイゼン | 削除 | 囚人の腕輪 |
|  | 追加 | 巨蟹宮のクラウン |
|  | 追加 | 巨蟹宮のメイル |
| セリア=アルデ | 追加 | 双魚宮の宝冠 |
|  | 追加 | 双魚宮のメイル |
|  |  |  |


</details>

<details>
  <summary>通常MVP</summary>

| モンスター | 変更タイプ | アイテム |
|---|---|---|
| 黄金蟲 | 追加 | サバイバルオーブ |
|  |  | ドラムシールド |
| ドラキュラ | 追加 | ヴァナルガンドの兜 |
|  | 追加 | ブラッドサッカー |
| 怨霊武士 | 追加 | 天邪鬼の鬼面 |
|  | 追加 | 風魔手裏剣・花吹雪 |
| アモンラー | 追加 | 時魔術師の指輪 |
|  | 追加 | スカルリング |
| ドレイク | 追加 | ドレイクコート |
|  | 追加 | 特選アジのお守り |
| ドッペルゲンガー | 追加 | 連合軍司令官のマント |
|  |  | 特選葉のお守り |
| ペクソジン | 追加 | オーソリティーサンダル |
|  |  | 特選ウサギのお守り |
| RSX-0806 | 追加 | ラストポインター |
|  | 追加 | ラストシャッター |
|  | 追加 | ラストクラッシャー |
|  | 追加 | ラストブーム |
|  | 削除 | 歯車 |
|  | 削除 | 懐中電灯 |
| ランドグリス | 追加 | 熾天使の花冠 |
|  | 追加 | 光る枝のお守り |
| データルザウルス | 追加 | 邪竜の鎧 |
|  | 追加 | 新鮮なマグロのお守り |
| セイレン=ウィンザー(MVP) | 追加 | 天秤宮のクラスナヤ |
|  | 追加 | 天秤宮のシューズ |
| オークヒーロー | 追加 | 天秤宮のマント |
|  | 追加 | 天秤宮のリング |
| エレメス=ガイル(MVP) | 追加 | 天蝎宮のカタール |
|  | 追加 | 天蝎宮のシューズ |
| アトロス | 追加 | 天蝎宮のマント |
|  | 追加 | 天蝎宮のリング |
| マーガレッタ=ソリン(MVP) | 追加 | 処女宮のディバインクロス |
|  | 追加 | 処女宮のシューズ |
| バフォメット | 追加 | 処女宮のマント |
|  | 追加 | 処女宮のリング |
| カトリーヌ=ケイロン(MVP) | 削除 | 亡者の冷気 |
|  | 追加 | 宝瓶宮のスタッフ |
|  | 追加 | 宝瓶宮のシューズ |
| 月夜花 | 追加 | 宝瓶宮のマント |
|  | 追加 | 宝瓶宮のリング |
| 怒りの月夜花 | 追加 | 狐耳鈴リボン |
|  | 追加 | 覚醒火雷大神靴 |
| セシル=ディモン(MVP) | 削除 | 人馬宮のハンターボウ |
|  | 追加 | 人馬宮のメイル |
| エドガ | 追加 | 人馬宮のマント |
|  | 追加 | 人馬宮のリング |
| ハワード=アルトアイゼン(MVP) | 削除 | 巨蟹宮のアックス |
|  | 追加 | 巨蟹宮のメイル |
| オークロード | 追加 | 巨蟹宮のマント |
|  | 追加 | 巨蟹宮のリング |
| セリア=アルデ(MVP) | 追加 | 双魚宮のスタッフオブソウル |
|  | 追加 | 双魚宮のシューズ |
| 黒蛇王 | 追加 | 双魚宮のマント |
|  | 追加 | 双魚宮のリング |
| フリオニ | 追加 | ポルックスクラウン |
|  | 追加 | ポルックスローブ |
| グルームアンダーナイト | 追加 | ポルックスブック |
|  | 追加 | ポルックスシューズ |
| ボイタタ | 追加 | ポルックスマント |
|  | 追加 | ポルックスリング |
| マヤー | 追加 | プロキオンクラウン |
|  | 追加 | プロキオンローブ |
| ダークロード | 追加 | プロキオンダガー |
|  | 追加 | プロキオンシューズ |
| オシリス | 追加 | プロキオンマント |
|  | 追加 | プロキオンリング |
| タオグンカ | 追加 | 暴徒のスカーフ |
|  | 追加 | サングラス |
| ミストレス | 追加 | トラペゾヘドロンシューズ |
|  | 追加 | 螺旋風魔の宝珠 |
| キエル-D-01 | 追加 | フェアリーオブエデン |
|  | 追加 | ぽっちゃりミミズのお守り |
| 魔剣士タナトスの思念体 | 追加 | 名も無き剣士のブーツ |
|  | 追加 | 精巧な猫じゃらしの模型 |
| 堕ちた大神官ヒバム | 追加 | ダークリング |
|  | 追加 | 知覚増幅リング |
| ストームナイト | 追加 | アルクイエンのネックレス |
| クトルラナックス | 追加 | ゲフェニア 氷の魔道具 |
|  | 追加 | トンボがとまった魔力の猫じゃらし |
| ファラオ | 追加 | 高級ドラムスーツ |
|  | 追加 | 高級ドラムケープ |
|  | 追加 | 高級ドラムシューズ |
|  | 削除 | タブレット |
|  |  |

</details>

<details>
  <summary>MD MVP</summary>

| MD | モンスター | 変更タイプ | アイテム |
|---|---|---|---|
| ニーズヘッグの巣 | ニーズヘッグの影 | 追加 | 古代龍の宝冠 |
|  |  | 追加 | 闇御津羽神靴 |
| 魔神の塔 | 魔神の巨影 | 追加 | 浮遊する太極玉 |
|  |  | 追加 | ハルワタート |
| ホラーおもちゃ工場 | セリーヌ・キミ | 追加 | ガーデンオブエデン |
|  |  | 追加 | ぷりちーウリボウシューズ |
| チャールストン工場 | チャールストン3号 | 追加 | エクセリオンシールド |
|  |  | 追加 | エクセリオンレッグ |
| サラの記憶 | 大長老アイリン | 追加 | ワースホイール |
|  |  | 追加 | フロンティアブーツ |
|  |  | 削除 | 串焼き |
| フェンリルとサラ | サラの幻影 | 追加 | イルシオンシールドI |
|  |  | 追加 | ふわふわタンポポシューズ |
| 封印された神殿 | 魔王バフォメット | 追加 | イルシオンレッグI |
|  |  | 追加 | イルシオンレッグII |
| 最後の部屋 | T_W_O | 追加 | イルシオンウィングI |
|  |  | 追加 | イルシオンウィングII |
| ヴェルナー研究所中央室 | CUTIE | 追加 | イルシオンチップα-I |
|  |  | 追加 | イルシオンチップα-II |
|  |  | 追加 | イルシオンチップβ-I |
|  |  | 追加 | イルシオンチップβ-II |
|  |  | 削除 | 古く青い箱 |
|  |  | 削除 | イグドラシルの実 |
| 悪夢のジターバグ | fff・ジターバグ | 追加 | イルシオンスーツI |
|  |  | 追加 | イルシオンスーツII |
| ハートハンター軍事基地 | Heart Hunter Ebel | 追加 | 鍛冶師の手甲 |
|  |  | 追加 | 朽ちたガーデンナイフ |
|  |  | 削除 | 古く青い箱 |
| 古のグラストヘイム | アムダライス | 追加 | クイーン・アンズ・リベンジ |
|  |  | 追加 | 白の騎士団の猫じゃらし |
| ゲフェン魔法大会 | フェンリル | 追加 | Phantom Cap |
|  |  | 追加 | フェザーシールド |
| バコナワの棲み処 | バコナワの宝箱 | 追加 | リス耳フード帽 |
|  | バコナワの宝箱 | 追加 | 剛勇無双の紋帽子 |
| 暴窟王の洞窟 | 頭領タコ | 追加 | 八卦の封呪 |
|  |  | 追加 | よちよちウリボウスタイ |
| ブワヤの巣 | ブワヤ | 追加 | ぴかぴかニャンニャンクラウン |
|  |  | 追加 | スナイピングシューズ |
| フェイスワームの巣 | 女王フェイスワーム | 追加 | 特選ドラムスーツ |
|  |  | 追加 | 特選ドラムケープ |
|  |  | 追加 | 特選ドラムシューズ |
| 過去の儀式の間 | ビジョウ | 追加 | 思念体シューズ各種 |
|  |  |  |  |

</details>

## 5. その他
* ベネット左側にMVPアリーナとMVPルームが設置されています(特にアリーナはそのうち削除するかも？)  
* ベネット左側にサンドバッグが設置されています  

## 6. Q&A
* 本鯖の課金装備がないんだけれど？ / 現状揃えられる装備だと弱いんだけれど？  
既にデータがあって入手手段がないだけなら追加します。  
ただし、rAthenaベースなのでjRO特有の装備はない可能性が高いです。  
その場合はスクリプトを実装する必要があり、時間がかかるので要望に対する対応優先順位は下がります。  
また、逆にjROに存在しないアイテムもデータベース上存在していることが多いので、下記の方法でサーバー設定を確認してみても面白いアイテムが見つかるかもしれません。  
* サーバーのアイテム設定を確認したいんだけれど、どうすればいい？  
SDE(Server Database Editor)を使って下さい。  
  1. ページ右上の緑ボタンの`Code`から`DownloadZIP`を選択し、サーバーのデータを全てダウンロードしておく
  2. [SDE](https://rathena.org/board/files/file/3269-server-database-editor/)をダウンロードしてインストール  
  **Program Files（x86）以外にインストールすること**  
  **Program Files（x86）にインストールした場合は、デスクトップ等のProgram Files外の別の場所にコピーするか、UACを無効にすること**  
  **Program Files（x86）にインストールしてUACが有効な場合は、4の作業が実施できなくなります**  
  3. 起動して`Settings`の画面を開いて`Client encoding`と`Server encoding`に`Japanese`を指定  
  ![sdesetting1](https://user-images.githubusercontent.com/59181965/103186292-4ff33300-4903-11eb-8f9d-35f9a1e0f624.png)
  4. `Resource files or folders`にクライアントの`dataフォルダ(あれば)`、`Systemフォルダ`、`DATA.INI`に登録してあるgrfファイルを順番にドロップ  
  5. `ServerDB`にサーバーのデータに含まれている`db\re`フォルダを指定  
  6. ItemInfoに`System\itemInfo.lub`を指定
  7. ItemやMob等から確認したいものを検索  
  ドロップするモンスターはアイテムのDropped byで、スクリプト実装済みかはScriptが空欄かどうかで判断してください  
  ![sdesetting2](https://user-images.githubusercontent.com/59181965/103186303-584b6e00-4903-11eb-9641-8c83b9b38abd.png)
* UnknownItem多くない？  
rAthenaベースなのでjROにないアイテムがUnknownItemで表示されていると思われます  
ItemInfoを設定すれば正常になるはずですけれども手間の関係上放置されています  
`@mobinfo`かSDEで推測して正常に表示したいアイテムの場合は依頼して下さい  
* 英語が分からないのでなんとかならない？  
日本語化には多大な労力がかかります  
日本語化したファイルを送ってくれたら反映します  
* 重力エラーが発生した  
SS、発生状況(特定のスキルを使用した、特定のモブを倒した等)を連絡して下さい  
ただし、クライアントの問題は原因究明が困難であり処置をとらないこともあります  
* MDでNPCの話をきくのが面倒なんだけれど？  
早口化したいけれど、時間とれないので我慢して下さい  
早口化したスクリプトを送ってくれれば導入します  
* パッチを当てなおしたい  
`server.dat`を削除して下さい

## 7. 外部リンク
* [Rico materials](http://ricomaterials.blog.fc2.com/)
* [Divine Pride](https://www.divine-pride.net/)
* [jRO DB](https://rotool.gungho.jp/)
* [RO2](https://ro.silk.to/)
---
<img src="doc/logo.png" align="right" height="90" />

# rAthena
[![Build Status](https://travis-ci.org/rathena/rathena.png?branch=master)](https://travis-ci.org/rathena/rathena) [![Build status](https://ci.appveyor.com/api/projects/status/8574b8nlwd57loda/branch/master?svg=true)](https://ci.appveyor.com/project/rAthenaAPI/rathena/branch/master) [![Total alerts](https://img.shields.io/lgtm/alerts/g/rathena/rathena.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/rathena/rathena/alerts/) [![Language grade: C/C++](https://img.shields.io/lgtm/grade/cpp/g/rathena/rathena.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/rathena/rathena/context:cpp) ![GitHub](https://img.shields.io/github/license/rathena/rathena.svg) ![GitHub repo size](https://img.shields.io/github/repo-size/rathena/rathena.svg)
> rAthena is a collaborative software development project revolving around the creation of a robust massively multiplayer online role playing game (MMORPG) server package. Written in C, the program is very versatile and provides NPCs, warps and modifications. The project is jointly managed by a group of volunteers located around the world as well as a tremendous community providing QA and support. rAthena is a continuation of the eAthena project.

[Forum](https://rathena.org/board)|[Discord](https://rathena.org/discord)|[Wiki](https://github.com/rathena/rathena/wiki)|[FluxCP](https://github.com/rathena/FluxCP)|[Crowdfunding](https://rathena.org/board/crowdfunding/)|[Fork and Pull Request Q&A](https://rathena.org/board/topic/86913-pull-request-qa/)
--------|--------|--------|--------|--------|--------

### Table of Contents
- [Private Server](#private-server)
  - [1. 規約](#1-規約)
  - [2. 接続方法](#2-接続方法)
    - [2.1 クライアント準備](#21-クライアント準備)
    - [2.2 アカウント作成方法](#22-アカウント作成方法)
  - [3. 仕様](#3-仕様)
  - [4. オリジナル仕様](#4-オリジナル仕様)
    - [4.1 成長システム](#41-成長システム)
    - [4.2 アイテム](#42-アイテム)
      - [4.2.1 オリジナル武器](#421-オリジナル武器)
      - [4.2.2 防具](#422-防具)
      - [4.2.3 エンチャント](#423-エンチャント)
      - [4.2.4 ランダムオプション](#424-ランダムオプション)
      - [4.2.5 消耗品](#425-消耗品)
    - [4.3 ドロップ変更点](#43-ドロップ変更点)
  - [5. その他](#5-その他)
  - [6. Q&A](#6-qa)
  - [7. 外部リンク](#7-外部リンク)
  - [* RO2](#-ro2)
- [rAthena](#rathena)
    - [Table of Contents](#table-of-contents)
  - [1. Prerequisites](#1-prerequisites)
    - [Hardware](#hardware)
    - [Operating System & Preferred Compiler](#operating-system--preferred-compiler)
    - [Required Applications](#required-applications)
    - [Optional Applications](#optional-applications)
  - [2. Installation](#2-installation)
    - [Full Installation Instructions](#full-installation-instructions)
  - [3. Troubleshooting](#3-troubleshooting)
  - [4. More Documentation](#4-more-documentation)
  - [5. How to Contribute](#5-how-to-contribute)
  - [6. License](#6-license)

## 1. Prerequisites
Before installing rAthena there are certain tools and applications you will need which
differs between the varying operating systems available.

### Hardware
Hardware Type | Minimum | Recommended
------|------|------
CPU | 1 Core | 2 Cores
RAM | 1 GB | 2 GB
Disk Space | 300 MB | 500 MB

### Operating System & Preferred Compiler
Operating System | Compiler
------|------
Linux  | [gcc-5 or newer](https://www.gnu.org/software/gcc/gcc-5/) / [Make](https://www.gnu.org/software/make/)
Windows | [MS Visual Studio 2013, 2015, 2017](https://www.visualstudio.com/downloads/)

### Required Applications
Application | Name
------|------
Database | [MySQL 5 or newer](https://www.mysql.com/downloads/) / [MariaDB 5 or newer](https://downloads.mariadb.org/)
Git | [Windows](https://gitforwindows.org/) / [Linux](https://git-scm.com/download/linux)

### Optional Applications
Application | Name
------|------
Database | [MySQL Workbench 5 or newer](http://www.mysql.com/downloads/workbench/)

## 2. Installation 

### Full Installation Instructions
  * [Windows](https://github.com/rathena/rathena/wiki/Install-on-Windows)
  * [CentOS](https://github.com/rathena/rathena/wiki/Install-on-Centos)
  * [Debian](https://github.com/rathena/rathena/wiki/Install-on-Debian)
  * [FreeBSD](https://github.com/rathena/rathena/wiki/Install-on-FreeBSD)

## 3. Troubleshooting

If you're having problems with starting your server, the first thing you should
do is check what's happening on your consoles. More often that not, all support issues
can be solved simply by looking at the error messages given. Check out the [wiki](https://github.com/rathena/rathena/wiki)
or [forums](https://rathena.org/forum) if you need more support on troubleshooting.

## 4. More Documentation
rAthena has a large collection of help files and sample NPC scripts located in the /doc/
directory. These include detailed explanations of NPC script commands, atcommands (@),
group permissions, item bonuses, and packet structures, among many other topics. We
recommend that all users take the time to look over this directory before asking for
assistance elsewhere.

## 5. How to Contribute
Details on how to contribute to rAthena can be found in [CONTRIBUTING.md](https://github.com/rathena/rathena/blob/master/.github/CONTRIBUTING.md)!

## 6. License
Copyright (c) rAthena Development Team - Licensed under [GNU General Public License v3.0](https://github.com/rathena/rathena/blob/master/LICENSE)
