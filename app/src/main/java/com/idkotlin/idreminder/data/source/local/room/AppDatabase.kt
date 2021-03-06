package com.tutorial.learnlinuxpro.data.source.local.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.idkotlin.idreminder.data.entity.Reminder
import com.idkotlin.idreminder.data.source.local.room.ReminderDao

/**
 * Created by kodeartisan on 16/10/17.
 */
@Database(entities = arrayOf(Reminder::class), version = 2, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun reminderDao(): ReminderDao


}