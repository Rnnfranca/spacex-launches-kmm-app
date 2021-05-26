package me.user.shared.database

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import me.user.spacexlaunches.shared.database.SpaceXLaunches

actual class DatabaseDriverFactory(private val context: Context) {

    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(SpaceXLaunches.Schema, context, "spacexlaunches.db")
    }

}