# Moo

Android logging library.

This library is does not output a log when release build(releaseCompile).

# How to use

```java
Moo.d(TAG, "d test");
Moo.d(TAG, "d test", new Exception());

Moo.v(TAG, "v test");
Moo.v(TAG, "v test", new Exception());

Moo.i(TAG, "i test");
Moo.i(TAG, "i test", new Exception());

Moo.w(TAG, "w test");
Moo.w(TAG, "w test", new Exception());
Moo.w(TAG, new Exception("w test"));

Moo.e(TAG, "e test");
Moo.e(TAG, "e test", new Exception());

Moo.wtf(TAG, "wtf test");
Moo.wtf(TAG, "wtf test", new Exception());
Moo.w(TAG, new Exception("wtf test"));

Moo.d(TAG, Moo.getStackTraceString(new Exception("test getStackTraceString")));
```

[android.util.Log](https://developer.android.com/reference/android/util/Log.html)

## Download

Gradle:
```groovy
debugCompile 'com.os.operando.moo:moo:0.2.0'
releaseCompile 'com.os.operando.moo:moo-no-op:0.2.0'
```
