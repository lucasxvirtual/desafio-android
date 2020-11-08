package com.example.infinitescroll.di

import com.example.infinitescroll.data.api.ApodService
import com.example.infinitescroll.data.local.ApodDao
import com.example.infinitescroll.data.mapper.ApodMapper
import com.example.infinitescroll.data.repository.ApodRepositoryImpl
import com.example.infinitescroll.domain.repository.ApodRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideApodRepository(apodDao : ApodDao, apodService: ApodService, apodMapper: ApodMapper): ApodRepository {
        return ApodRepositoryImpl(apodDao, apodService, apodMapper)
    }
}