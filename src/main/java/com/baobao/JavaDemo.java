package com.baobao;

public class JavaDemo {
    public static void main(String[] args) {
        ExtendedInferenceModel model = new ExtendedInferenceModel();

        String modelPath = "/home/qiaoyu/Tianchi/Flink_export_20190812";
        model.loadTF(modelPath);
    }
}
