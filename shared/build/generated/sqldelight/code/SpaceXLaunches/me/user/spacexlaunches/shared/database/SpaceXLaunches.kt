package me.user.spacexlaunches.shared.database

import com.squareup.sqldelight.Transacter
import com.squareup.sqldelight.db.SqlDriver
import me.user.spacexlaunches.shared.database.shared.newInstance
import me.user.spacexlaunches.shared.database.shared.schema
import meuserspacexlaunchesshareddatabase.SpaceXLaunchesQueries

interface SpaceXLaunches : Transacter {
  val spaceXLaunchesQueries: SpaceXLaunchesQueries

  companion object {
    val Schema: SqlDriver.Schema
      get() = SpaceXLaunches::class.schema

    operator fun invoke(driver: SqlDriver): SpaceXLaunches =
        SpaceXLaunches::class.newInstance(driver)}
}
