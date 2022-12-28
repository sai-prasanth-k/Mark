package com.saiprasanth.mark.di

import android.app.Application
import androidx.room.Room
import com.saiprasanth.mark.data.data_source.MarkDatabase
import com.saiprasanth.mark.data.repository.NoteRepositoryImpl
import com.saiprasanth.mark.domain.repository.NoteRepository
import com.saiprasanth.mark.domain.usecase.DataUseCase
import com.saiprasanth.mark.domain.usecase.DeleteData
import com.saiprasanth.mark.domain.usecase.GetData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(app : Application):MarkDatabase{
        return Room.databaseBuilder(
            app,
            MarkDatabase::class.java,
            MarkDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideRepository(db : MarkDatabase):NoteRepository{
        return NoteRepositoryImpl(db.databaseDao)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: NoteRepository):DataUseCase{
        return DataUseCase(
            getData = GetData(repository),
            deleteData = DeleteData(repository)
        )
    }
}