# HtmlUnitTao
基于HtmlUnit2.18 ,增加单台计算机动态多网卡多出口IP支持。在webClient.getOptions()下增加了setLocalAddress_方法，传入的参数类型是InetAddress
webClient.getOptions().setLocalAddress_(getLocalInetAddress("xxx.xxx.xxx.xxx"));
org.taoningyu.test 有测试例程。
Base HtmlUnit2.18.
If you have one moe InetAddress on your computer ,you could use this program to use them.
ex. webClient.getOptions().setLocalAddress_(getLocalInetAddress("xxx.xxx.xxx.xxx"));
see detail   org.taoningyu.test


