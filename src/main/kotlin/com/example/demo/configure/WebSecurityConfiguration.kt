package com.example.demo.configure

import org.springframework.beans.factory.annotation.Configurable
import org.springframework.context.annotation.Bean
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

@Configurable
@EnableWebSecurity
class WebSecurityConfiguration : WebSecurityConfiguraterAdapter {

    @Bean
    fun encoder() : PasswordEncoder = BCryptPasswordEncoder(11)


    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth?.authenticationProvider()
    }

    @Bean
    fun authenticationProvider() : DaoAuthenticationConfigurer{
        val authProvider = DaoAuthenticationProvider()
        authProvider.setUserDetailsService()
        authProvider.setPasswordEncoder()
    }

}