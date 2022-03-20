package utils

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger


class l {
    private var NAME = "Furniture"
    init{
        val formatStrategy = Logger.addLogAdapter(AndroidLogAdapter())
    }
}