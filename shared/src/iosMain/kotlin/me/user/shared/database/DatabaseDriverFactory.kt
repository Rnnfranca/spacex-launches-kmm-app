package me.user.shared.database

import com.squareup.sqldelight.db.SqlDriver
import me.user.spacexlaunches.shared.database.SpaceXLaunches

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(SpaceXLaunches.Schema, "spacexlaunches.db")
    }

}