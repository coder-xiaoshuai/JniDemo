# JniDemo
# 这是一个简单的jni例子 实现了java和jni的互相调用  
环境准备：需要下载好ndk并且配置好环境变量  
开始code:  
第一步：在java中声明native方法 参见JniTest.java类  
第二步：编译java源文件得到class文件，然后通过javah命令生成jni的头文件  
![](https://github.com/coder-xiaoshuai/JniDemo/blob/master/app/image/image1.png)  
![Image](https://github.com/coder-xiaoshuai/JniDemo/blob/master/app/image/image2.png)  
第三步：实现jni方法  
第四步：cd到jni目录，执行ndk-build命令编译生成so库  
![Image](https://github.com/coder-xiaoshuai/JniDemo/blob/master/app/image/image3.png)  
第五步：在app/src/main中创建jniLibs目录，并将生成的so库复制到该目录中  
那么接下来就可以直接在代码中直接调用JniTest中的native方法了  
