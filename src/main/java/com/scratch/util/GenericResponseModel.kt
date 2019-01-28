package com.scratch.util

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
class GenericResponseModel(val success: Boolean = true, val id: String? = null, var records: List<Any>? = null, var errorCode: String? = null, var message: String? = null, var errors: List<Any>? = null)

