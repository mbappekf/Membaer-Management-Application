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
I'm sorry, but I haven't deployed the application yet.  
Below is a screenshot of the execution in the local environment, so please refer to it.  

This is the URL under the local environment. Please use it if you like.　　
以下，ローカル環境下での実行の際にご活用下さい．  
## URL  
・Signup page  
http://localhost:8080/user/signup

・Login page  
http://localhost:8080/login  

sample(for login):  
ID : kaname.f.1995g@gmail.com  
pass : Kaname8206

・Main page  
http://localhost:8080/user/list#




# Overview
・I developed a web application using JAVA SpringBoot. It is possible to manage the members belonging to the organization.
・Java SprongBoot を用いてwebアプリケーションを作成しました．組織内のメンバーを管理することが可能です．  
・Implemented user registration, login, display of list on screen, update of personal information, etc.
・アプリケーション内にはユーザー登録，ログイン，ログアウト，登録されているデータの一覧表示，個人情報の更新などを実装しました．  
・The data stored in MySQL was mapped and the data was linked by using MyBatis.
・データベースにはMySQLを活用．MyBatisを用いてマッピングしました．

## Signup
 Register the user. To register a user, you need to enter the user ID, password, user name, birthday, age, and gender.  
As for gender, enter the form and use the selection form instead of the form.
ユーザーの新規登録が可能です．ユーザーID，パスワード，ユーザー名，生年月日，年齢と性別を入力することで登録が可能です．  
それぞれに入力フォームを用意し，性別の項目は入力フォームでは無く，選択フォーム使用にしました．  
![img.png](img.png)
 Registerボタンを押すことでログイン画面に遷移します．  
 

### -Validation
When registering as a user, if an input that does not meet the specified rules is detected, a warning will be issued without page transition. Specifically, if you do not follow the form below, a warning will be issued.
ユーザー登録に段階的なバリデーションを施しました．入力内容が規定のルールを見たさない場合，エラーメッセージによりその旨を表示します．  
それぞれの入力ルールは下記のようになります．  

・User ID ------- email form

・password ------ with 4 digits or more and 100 digits or less

・birthday ------ YYYY/MM/dd form

 If you have not entered each item, you will be warned that you must enter it.
 入力フォームを満たしていてもすでに登録されているユーザー名などが入力された場合もエラーメッセージによりその旨を表示します．  

In addition, validation has a two-step check, and if the above rule is not satisfied even if the input is completed, the page transition will not be performed.
![img_1.png](img_1.png)


## Login
  The login screen requires you to enter your user ID and password. If the input is correct, press the Login button to move to the user list screen where you can check the registered users. 
 Press Signup at the bottom of the login button to move to the Signup screen.
![img_2.png](img_2.png)


## User Table
  You can check the list of registered users on the user table page.  
Extract data from MYSQL database. Map the data by using MyBatis.
The mapped data is linked on the xml file.  
 A sense of unity is created by using Bootstrap for the page layout. A User Table link is set up on the left side of the page. You can always transition to this page.  
 A logout button is installed in the upper right part of the page. You can log out of the system by pressing it.  
![img_3.png](img_3.png)
  By pressing the detail button on the right side of the user list, you can move to the detail screen of each user.


## User's Detail
Display the details of the selected user. The password is hidden from the viewpoint of security.
You can update the user name and delete the user information on this screen.  
This is possible by pressing each button at the bottom.
![img_4.png](img_4.png)
