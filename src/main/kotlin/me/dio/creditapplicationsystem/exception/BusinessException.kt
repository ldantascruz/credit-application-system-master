package me.dio.creditapplicationsystem.exception

data class BusinessException(override val message: String?) : RuntimeException(message)
