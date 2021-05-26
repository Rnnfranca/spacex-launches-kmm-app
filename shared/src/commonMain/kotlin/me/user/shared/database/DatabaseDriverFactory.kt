package me.user.shared.database

import com.squareup.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory {

    fun createDriver(): SqlDriver

}