# Member Management Application

## 使用技術  
・Java  
・SpringBoot  
・Tymeleaf  
・html, CSS  
・BootStrap  
・MyBatis  

Database  
・MySQL  

Build tool  
・gradle  


アプリケーションのディプロイまでは至っておりません．ローカル環境にて実行した様子をスクリーンショットにまとめましたので以下，参照いただけると幸いです．  


## URL  

よろしければ，ローカル環境での実行に以下ご活用ください．  

・Signup page  
http://localhost:8080/user/signup

・Login page  
http://localhost:8080/login  

・sample(for login):  
ID : kaname.f.1995g@gmail.com  
pass : Kaname8206

・Main page  
http://localhost:8080/user/list#




# Overview
・Java SprongBoot を用いてwebアプリケーションを作成しました．組織内のメンバーを管理することが可能です．  
・アプリケーション内にはユーザー登録，ログイン，ログアウト，登録されているデータの一覧表示，個人情報の更新などを実装しました．  
・データベースにはMySQLを活用．MyBatisを用いてマッピングしました．

## Signup
ユーザーの新規登録が可能です．ユーザーID，パスワード，ユーザー名，生年月日，年齢と性別を入力することで登録が可能です．  
それぞれに入力フォームを用意し，性別の項目は入力フォームでは無く，選択フォーム仕様にしました．  

![img.png](img.png)
Signupボタンを押すことでログイン画面に遷移します．  
 

### -Validation
ユーザー登録に段階的なバリデーションを施しました．入力内容が規定のルールを見たさない場合，エラーメッセージによりその旨を表示します．  
それぞれの入力ルールは下記のようになります．  

・User ID ------- email form

・password ------ with 4 digits or more and 100 digits or less

・birthday ------ YYYY/MM/dd form  

 入力フォームを満たしていてもすでに登録されているユーザー名などが入力された場合もエラーメッセージによりその旨を表示します．  

![img_1.png](img_1.png)

## Login
予め登録されたユーザーIDとパスワードを入力数ることでシステムへのログインが可能です．Loginボタンを押下することでメイン画面に遷移します．  
Signupボタンを押下することでユーザー登録画面に遷移することも可能です．  

![img_2.png](img_2.png)


## User Table
登録されたユーザーの一覧を参照することが出来ます．  
データベース上に保存されたユーザーデータをMyBatisを用いてマッピングさせ表示しています．  
ユーザーの情報にはDetailボタンを付与し，押下することで各人の個人ページに遷移し詳細を確認することが可能です．  
ページのレイアウトにはBootStrapを用いてシンプルな仕様にしました．  
左上の「Member ~ 」を押下することでいつでもこのページに遷移することが可能です．  
また，ページ右上にはLogoutボタンを設置し，押下することでいつでもログイン画面に遷移することが可能．  

![img_3.png](img_3.png)  


## User's Detail  
ユーザーの情報を詳細に確認可能です．  
データを参照できるだけでなく，ユーザー名の更新もこの画面上で可能です．  
また，パスワードは個人情報保護の観点から非表示にしています．  
画面下にあるupdateボタンで入力した新しい情報の更新，deleteボタンで登録されたユーザーを削除することが可能です．  

![img_4.png](img_4.png)
