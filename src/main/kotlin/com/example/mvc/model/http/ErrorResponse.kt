package com.example.mvc.model.http

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

data class ErrorResponse(

        @field:JsonProperty("result_code")
        var resultCode: String?=null,

        @JsonProperty("http_method")
        var httpMethod:String?=null,

        @field:JsonProperty("http_status")
        var httpStatus:String?=null,

        var message:String?=null,
        var path:String?=null,


        //@field:JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 이렇게 하면 반환 형태 지정해줄수 있음
        var timestamp:LocalDateTime?=null,
        var errors:MutableList<Error>?= mutableListOf(),
)

data class Error(
        var field:String?=null,
        var message:String?=null,
        var value:Any?=null
)
