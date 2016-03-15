# HtmlUnitTao
基于HtmlUnit2.18 ,增加单台计算机动态多网卡多出口IP支持。在webClient.getOptions()下增加了setLocalAddress_方法，传入的参数类型是InetAddress。</br>
例如：</br>
webClient.getOptions().setLocalAddress_(getLocalInetAddress("xxx.xxx.xxx.xxx"));</br>
org.taoningyu.test 有测试例程。</br>
Base on HtmlUnit2.18.</br>
If you have one moe InetAddress on your computer ,you could use this program to use them.</br>
ex. webClient.getOptions().setLocalAddress_(getLocalInetAddress("xxx.xxx.xxx.xxx"));</br>
see detail   org.taoningyu.test</br>


