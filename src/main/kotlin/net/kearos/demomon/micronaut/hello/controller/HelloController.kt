package net.kearos.demomon.micronaut.hello.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.tracing.annotation.ContinueSpan

@Controller("/hello")
open class HelloController {

    @Get("/")
    @ContinueSpan
    @Produces(MediaType.TEXT_PLAIN)
    open fun index(): String {
        return "Hello World! Bis"
    }
}
