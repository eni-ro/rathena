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
| 開放コマンド | @commands |
|  | @go |
|  | @load |
|  | @mobinfo |
|  | @whodrops |
|  | @iteminfo |
|  | @identify |
|  | @autoloot |
|  | @alootid |
|  | @autoloottype |
|  | @autopot |
| 転生 | 無し(※1) |
| ステータス/スキルリセット | 合計5回まで可能 |

※1 ベネット右上の転職NPCを利用すると、ノービスから直接転生1次職に転職できます。  

</details>

初期アイテムに、World Tour Ticket(メニューのワールドマップから移動する際に必要なアイテム)を所持しています。  
一部ポタ子のメニューにないものは、ワールドマップ→Navigation Windowの`MOVEボタン`→`Use World Tour Ticket`から移動できないか試してみてください

## 4. オリジナル仕様
### 4.1 成長システム
モンスターを倒した際に確率でステータスが上がったりスキルポイントを取得することがあります。  
ステータスの成長確率はモンスターとプレイヤーのLV差とMVPモンスターかどうかによって決定します。  

|| モンスターLV - プレイヤーLV | 確率 |
| --- | --- | --- |
| MVP以外 | -20以下 | 0.6% |
|  | -20 ～ +20 | 変動 | 
|  | +20以上 | 2.0% | 
| MVP | -20以下 | 3.0% |
|  | -20 ～ +20 | 変動 | 
|  | +20以上 | 10.0% | 

ステータスの成長傾向は、初期設定で全ステータス同じになっており、ベネット右上の怪しい生物に話して変更することも出来ます。  
また、ステータスが上限に達した後に該当するステータスの成長が抽選された場合、他のステータス成長への再抽選は行われず、ステータス成長の機会が無駄になります。  
その為、特定のステータスが上限に達した後は、上限に達していないステータスが成長しやすい成長傾向に変更することをお勧めします。

スキルポイントの取得確率は固定で0.75%です。

<span style="color: red; ">成長システムに関しては、バランスが悪ければ今後確率を変更する可能性があります</span>

### 4.2 オリジナルアイテム
#### 4.2.1 武器
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
| シャドウシールド | 反射被ダメ-100% |
| シャドウシューズ | 移動速度アップ |
</details>

<details>
  <summary>スペシャルエンチャント</summary>
ベネット室内NPC左側のWPの先にいるNPCから、一部装備のスペシャルエンチャントを可能です。  
スペシャルエンチャントで必要になるアイテムは、MDのクリア報酬で入手可能です。

| 部位 | 効果 |
| --- | --- |
| 上段 | ガーデンオブエデン |
| 中段 | 浮遊する太極玉 |
| 鎧 | ドレイクコート |
| 肩 | 連合軍司令官のマント |

</details>

#### 4.2.4 消耗品

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
| セリア=アルデ | 追加 | 双魚宮の宝冠 |
|  | 追加 | 双魚宮のメイル |
|  |  |  |


</details>

<details>
  <summary>通常MVP</summary>

| モンスター | 変更タイプ | アイテム |
|---|---|---|
| 黄金蟲 | 追加 | サバイバルオーブ |
| ドラキュラ | 追加 | ヴァナルガンドの兜 |
|  | 追加 | ブラッドサッカー |
| 怨霊武士 | 追加 | 天邪鬼の鬼面 |
| アモンラー | 追加 | 時魔術師の指輪 |
| ドレイク | 追加 | ドレイクコート |
| ドッペルゲンガー | 追加 | 連合軍司令官のマント |
| ペクソジン | 追加 | オーソリティーサンダル |
| RSX-0806 | 追加 | ラストポインター |
|  | 追加 | ラストシャッター |
|  | 追加 | ラストクラッシャー |
|  | 追加 | ラストブーム |
|  | 削除 | 歯車 |
|  | 削除 | 懐中電灯 |
| ランドグリス | 追加 | 熾天使の花冠 |
| データルザウルス | 追加 | 邪竜の鎧 |
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
| セリア=アルデ(MVP) | 追加 | 双魚宮のスタッフオブソウル |
|  | 追加 | 双魚宮のシューズ |
| 黒蛇王 | 追加 | 双魚宮のマント |
|  | 追加 | 双魚宮のリング |
| フリオニ | 追加 | ポルックスクラウン |
|  | 追加 | ポルックスローブ |
| グルームアンダーナイト | 追加 | ポルックスブック |
|  | 追加 | ポルックスシューズ |
| オークロード | 追加 | ポルックスマント |
|  | 追加 | ポルックスリング |
| タオグンカ | 追加 | 暴徒のスカーフ |
|  | 追加 | サングラス |
| ミストレス | 追加 | トラペゾヘドロンシューズ |
|  |  |  |

</details>

<details>
  <summary>MD MVP</summary>

| モンスター | 変更タイプ | アイテム |
|---|---|---|
| ニーズヘッグの影 | 追加 | 古代龍の宝冠 |
| 魔神の巨影 | 追加 | 浮遊する太極玉 |
| セリーヌ・キミ | 追加 | ガーデンオブエデン |
| チャールストン3号 | 追加 | エクセリオンシールド |
|  | 追加 | エクセリオンレッグ |
| 大長老アイリン | 追加 | ワースホイール |
| サラの幻影 | 追加 | イルシオンシールドI |
| 魔王バフォメット | 追加 | イルシオンレッグI |
|  | 追加 | イルシオンレッグII |
| T_W_O | 追加 | イルシオンウィングI |
|  | 追加 | イルシオンウィングII |
| CUTIE | 追加 | イルシオンチップα-I |
|  | 追加 | イルシオンチップα-II |
|  | 追加 | イルシオンチップβ-I |
|  | 追加 | イルシオンチップβ-II |
|  | 削除 | 古く青い箱 |
|  | 削除 | イグドラシルの実 |
| fff・ジターバグ | 追加 | イルシオンスーツI |
|  | 追加 | イルシオンスーツII |
| Heart Hunter Ebel | 追加 | 鍛冶師の手甲 |
| アムダライス | 追加 | クイーン・アンズ・リベンジ |
| フェンリル | 追加 | Phantom Cap |
| バコナワの宝箱 | 追加 | リス耳フード帽 |
| 頭領タコ | 追加 | 八卦の封呪 |
|  |  |  |

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
    - [4.2 オリジナルアイテム](#42-オリジナルアイテム)
      - [4.2.1 武器](#421-武器)
      - [4.2.2 防具](#422-防具)
      - [4.2.3 エンチャント](#423-エンチャント)
      - [4.2.4 消耗品](#424-消耗品)
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
