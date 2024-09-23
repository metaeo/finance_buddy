package com.klolarion.finance_buddy.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Positive


// 회원가입 요청
data class SignupRequest(
        @field:NotBlank val account: String,
)

// 로그아웃 요청
data class LogoutRequest(
        @field:NotBlank(message = "Token is required")
        val token: String
)

// 소셜 로그인 응답
data class AuthResponse(
        val token: String,
        val provider: String? = null
)

// 계정 찾기 응답
data class ProviderResponse(
        val provider: String
)

// 투자 정보 입력 요청
data class InvestmentRequest(
        @field:Positive(message = "Age must be positive")
        val age: Int,

        @field:Positive(message = "Investment amount must be positive")
        val investmentAmount: Double,

        @field:NotBlank(message = "Investment period is required")
        val investmentPeriod: String,

        @field:NotBlank(message = "Preferred product is required")
        val preferredProduct: String
)

// 챗봇 요청
data class ChatRequest(
        @field:NotBlank(message = "Message is required")
        val message: String
)

// Recommendation 데이터 클래스 정의
data class Recommendation(
        val message: String,
        val name: String,
        val type: String,
        val issuer: String,
        val issueDate: String? = null,
        val expiryDate: String? = null,
        val price: Double? = null,
        val currency: String? = null,
        val category: String,
        val riskLevel: String? = null,
        val interestRate: Double? = null
)

data class InvestmentProfile(
        @field:Positive(message = "Age must be positive")
        val age: Int,

        @field:Positive(message = "Investment amount must be positive")
        val investmentAmount: Double,

        @field:NotBlank(message = "Investment period is required")
        val investmentPeriod: String,

        @field:NotBlank(message = "Preferred product is required")
        val preferredProduct: String
)