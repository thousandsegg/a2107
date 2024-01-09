package com.example.hilt_demo.bean
/*
* bean : 豆 = entity
* */
data class BannerBean(
    val code: Int,
    val `data`: Data,
    val msg: String
)

data class Data(
    val endRow: Int,
    val hasNextPage: Boolean,
    val hasPreviousPage: Boolean,
    val isFirstPage: Boolean,
    val isLastPage: Boolean,
    val list: List<BannerItem>,
    val navigateFirstPage: Int,
    val navigateLastPage: Int,
    val navigatePages: Int,
    val navigatepageNums: List<Int>,
    val nextPage: Int,
    val pageNum: Int,
    val pageSize: Int,
    val pages: Int,
    val prePage: Int,
    val size: Int,
    val startRow: Int,
    val total: Int
)

data class BannerItem(
    val id: Int,
    val imagepath: String,
    val imgorder: Int,
    val title: String,
    val type: Int,
    val url: Any
)