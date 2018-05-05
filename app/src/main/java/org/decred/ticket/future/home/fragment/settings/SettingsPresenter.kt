package org.decred.ticket.future.home.fragment.settings

import org.decred.ticket.DAO.UserPreference
import org.decred.ticket.future.home.HomeContract
import javax.inject.Inject

class SettingsPresenter @Inject constructor(
        private val view: HomeContract.View,
        private val userPreference: UserPreference) : HomeContract.Presenter