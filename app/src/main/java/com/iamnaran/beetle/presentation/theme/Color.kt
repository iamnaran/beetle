import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.Colors

internal data class ThemeValues(val description: String, val colors: Colors)

internal val initialThemeValues = ThemeValues(
    "Lilac (D0BCFF)",
    Colors(
        primary = Color(0xFFFF1010),
        primaryVariant = Color(0xFFFF9292),
        secondary = Color(0xFFFFFFFF),
        secondaryVariant = Color(0xFFD6D6D6)
    )
)

internal val themeValues = listOf(
    initialThemeValues,
    ThemeValues("Blue (Default AECBFA)", Colors()),
    ThemeValues(
        "Blue 2 (7FCFFF)",
        Colors(
            primary = Color(0xFF7FCFFF),
            primaryVariant = Color(0xFF3998D3),
            secondary = Color(0xFF6DD58C),
            secondaryVariant = Color(0xFF1EA446)
        )
    ),
    ThemeValues(
        "Green (6DD58C)",
        Colors(
            primary = Color(0xFF6DD58C),
            primaryVariant = Color(0xFF1EA446),
            secondary = Color(0xFFFFBB29),
            secondaryVariant = Color(0xFFD68400)
        )
    )
)