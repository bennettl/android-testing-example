package itp341.lee.testdemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint
import itp341.lee.testdemo.R
import itp341.lee.testdemo.databinding.ActivityMainBinding
import itp341.lee.testdemo.viewmodel.MainActivityViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: MainActivityViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding  = DataBindingUtil.setContentView(
                this, R.layout.activity_main
        )
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

    }
}