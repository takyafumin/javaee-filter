# javaee-filter
===============================

filter動作確認用のサンプル


## フォルダ構成
-------------------------------

|       フォルダ      |             |           用途          |
| ------------------- | ----------- | ----------------------- |
| src/main/java/      |             | Javaソース              |
| src/main/resources/ |             | リソースファイル        |
|                     | logback.xml | +-- logback設定ファイル |


## Javaプログラム
-------------------------------

|            パッケージ名           |    クラス名    |                           |
| --------------------------------- | -------------- | ------------------------- |
| com.example.sample.filter.servlet | ForwardAction  | フォワードでJSPを表示する |
|                                   | RedirectAction | JSPへリダイレクトする     |


## 動作確認方法
-------------------------------

###  フォワード時の動作確認

* 以下URLへアクセス
    - http://localhost:8080/filter/forward

```
[INFO ] [c.e.s.f.s.Filter1st] doFilter() start
[INFO ] [c.e.s.f.s.Filter2nd] doFilter() start
[INFO ] [c.e.s.f.s.ForwardAction] doGet() start
[INFO ] [c.e.s.f.s.ForwardAction] doGet() forward start[/index.jsp]
[INFO ] [i.jsp] start
[INFO ] [i.jsp] end
[INFO ] [c.e.s.f.s.ForwardAction] doGet() forward end [/index.jsp]
[INFO ] [c.e.s.f.s.ForwardAction] doGet() end
[INFO ] [c.e.s.f.s.Filter2nd] doFilter() end
[INFO ] [c.e.s.f.s.Filter1st] doFilter() end
```

filter1 -> filter2 -> servlet -> jsp -> servlet -> filter2 -> filter1



###  リダイレクト時の動作確認

* 以下URLへアクセス
    - http://localhost:8080/filter/redirect

```
[INFO ] [c.e.s.f.s.Filter1st] doFilter() start
[INFO ] [c.e.s.f.s.Filter2nd] doFilter() start
[INFO ] [c.e.s.f.s.RedirectAction] doGet() start
[INFO ] [c.e.s.f.s.RedirectAction] doGet() redirect start[index.jsp]
[INFO ] [c.e.s.f.s.RedirectAction] doGet() redirect end [index.jsp]
[INFO ] [c.e.s.f.s.RedirectAction] doGet() end
[INFO ] [c.e.s.f.s.Filter2nd] doFilter() end
[INFO ] [c.e.s.f.s.Filter1st] doFilter() end
[INFO ] [c.e.s.f.s.Filter1st] doFilter() start
[INFO ] [c.e.s.f.s.Filter2nd] doFilter() start
[INFO ] [i.jsp] start
[INFO ] [i.jsp] end
[INFO ] [c.e.s.f.s.Filter2nd] doFilter() end
[INFO ] [c.e.s.f.s.Filter1st] doFilter() end
```

filter1 -> filter2 -> servlet -> filter2 -> filter1
-> filter1 -> filter2 -> jsp -> filter2 -> filter1

