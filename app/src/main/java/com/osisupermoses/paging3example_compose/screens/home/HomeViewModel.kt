package com.osisupermoses.paging3example_compose.screens.home

import androidx.lifecycle.ViewModel
import com.osisupermoses.paging3example_compose.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    repository: Repository
): ViewModel() {
    val getAllImages = repository.getAllImages()
}