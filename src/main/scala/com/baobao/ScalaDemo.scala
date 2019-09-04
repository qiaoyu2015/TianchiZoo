package com.baobao

import com.intel.analytics.zoo.pipeline.inference.InferenceModel
import scala.Serializable

class ScalaDemo {

}

object ScalaDemo {
  def main(args: Array[String]): Unit = {
    val str = "maven program scala test"
    println(str)

    val modelPath = "/home/qiaoyu/Tianchi/Flink_export_20190812"
    val model = new InferenceModel()
    model.doLoadTF(modelPath)
  }
}
