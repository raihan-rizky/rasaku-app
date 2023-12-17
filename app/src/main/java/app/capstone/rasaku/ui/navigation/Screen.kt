package app.capstone.rasaku.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Search : Screen("search")
    object Camera : Screen("camera")
    object Favorite : Screen("favorite")
    object History : Screen("history")
    object Welcome: Screen("welcome")
    object Login : Screen("welcome/login")
    object Register: Screen("welcome/register")
    object FoodDetail: Screen("foods/{id}"){
        fun createRoute(id: Int) = "foods/$id"
    }
    object SearchInput : Screen("search/query")
    object SearchResult : Screen("search/query/{query}"){
        fun createRoute(query: String) = "search/query/$query"
    }
    object FavoriteList : Screen("favorite/{id}"){
        fun createRoute(id: Long) = "favorite/$id"
    }

}
