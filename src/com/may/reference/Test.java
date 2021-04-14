package com.may.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        /**
         * 强引用
         * 发生 gc 的时候不会被回收。
         * 强引用赋值为null,JVM就可以适时的回收对象了
         */
        Object obj = new Object();
        obj = null;

        /**
         * 软引用
         * 有用但不是必须的对象，在发生内存溢出之前会被回收。
         *
         */
//        SoftReference<Map<String,String>> softReference = new SoftReference<>(new HashMap<String, String>());
//        System.out.println(softReference.get());
//        System.gc();
//        System.out.println("after gc");
//        System.out.println(softReference.get());
//
//        List<byte[]> list = new LinkedList<>();
//
//        try{
//            for (int i=0;i<100;i++){
//                System.out.println("***********************************"+softReference.get());
//                list.add(new byte[1024*1024*100]);
//            }
//        } catch (Throwable e) {
//            System.out.println(" Throwable ***********************************"+softReference.get());
//        }


        /**
         * 弱引用
         * 有用但不是必须的对象，在下一次GC时会被回收。
         *
         *
         */
        WeakReference<Map<String,String>> weakReference = new WeakReference<>(new HashMap<String, String>());
        System.out.println(weakReference.get());
        System.gc();
        System.out.println("after gc");
        System.out.println(weakReference.get());

    }

    /**
     * 虚引用
     * 无法通过虚引用获得对象，用 PhantomReference 实现虚引用，虚引用的用途是在 gc 时返回一个通知。
     *
     *
     */



}
