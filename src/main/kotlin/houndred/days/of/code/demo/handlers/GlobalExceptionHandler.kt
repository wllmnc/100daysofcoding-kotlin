package houndred.days.of.code.demo.handlers

import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class GlobalExceptionHandler {
    @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="EmptyResultDataAccessException occured")
    @ExceptionHandler(EmptyResultDataAccessException::class)
    fun handleEmptyResultDataAccessException(request: HttpServletRequest, ex: Exception?) {}
}