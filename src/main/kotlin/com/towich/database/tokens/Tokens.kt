package com.towich.database.tokens

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction

object Tokens: Table("tokens") {
    private val id = Tokens.varchar("id", 50)
    private val email = Tokens.varchar("email", 25)
    private val token = Tokens.varchar("token", 50)

    fun insert(userDTO: TokensDTO) {
        transaction {
            Tokens.insert {
                it[id] = userDTO.id
                it[email] = userDTO.email
                it[token] = userDTO.token
            }
        }
    }
}