package prasad.vennam.jsonpro.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import prasad.vennam.jsonpro.data.repo.ProductsRepository
import prasad.vennam.jsonpro.data.repo.ProductsRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindProductsRepository(
        productsRepositoryImpl: ProductsRepositoryImpl,
    ): ProductsRepository
}