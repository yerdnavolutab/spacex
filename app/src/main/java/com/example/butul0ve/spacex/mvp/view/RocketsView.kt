package com.example.butul0ve.spacex.mvp.view

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.butul0ve.spacex.adapter.DragonAdapter

@StateStrategyType(AddToEndSingleStrategy::class)
interface RocketsView: MvpView {

    fun setAdapter(adapter: DragonAdapter)

    fun showProgressBar()

    fun hideProgressBar()
}