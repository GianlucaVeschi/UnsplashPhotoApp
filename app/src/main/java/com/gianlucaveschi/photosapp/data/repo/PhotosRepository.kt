package com.gianlucaveschi.photosapp.data.repo

import com.gianlucaveschi.photosapp.data.model.PhotoItemApiModel
import retrofit2.Response

interface PhotosRepository {
    suspend fun getPhotosList(): List<PhotoItemApiModel>?
    suspend fun getPhotoItem(photoId: String): PhotoItemApiModel?
}