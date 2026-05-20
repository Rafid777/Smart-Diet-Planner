package com.redbuddy.smartdietplanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.redbuddy.smartdietplanner.ui.theme.SmartDietPlannerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartDietPlannerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifierval supabase = createSupabaseClient(
                supabaseUrl = "https://eelsotrbprkahvlzfiqj.supabase.co",
        supabaseKey = "sb_publishable_J8EZc5nyBcUxSno4hHP74Q_IgIJuOGc"
    ) {
        install(Postgrest)
    }

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                MaterialTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        TodoList()
                    }
                }
            }
        }
    }

    @Composable
    fun TodoList() {
        var items by remember { mutableStateOf<List<TodoItem>>(listOf()) }
        LaunchedEffect(Unit) {
            withContext(Dispatchers.IO) {
                items = supabase.from("todos")
                    .select().decodeList<TodoItem>()
            }
        }
        LazyColumn {
            items(
                items,
                key = { item -> item.id },
            ) { item ->
                Text(
                    item.name,
                    modifier = Modifier.padding(8.dp),
                )
            }
        }
    }val supabase = createSupabaseClient(
        supabaseUrl = "https://eelsotrbprkahvlzfiqj.supabase.co",
        supabaseKey = "sb_publishable_J8EZc5nyBcUxSno4hHP74Q_IgIJuOGc"
    ) {
        install(Postgrest)
    }

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                MaterialTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        TodoList()
                    }
                }
            }
        }
    }

    @Composable
    fun TodoList() {
        var items by remember { mutableStateOf<List<TodoItem>>(listOf()) }
        LaunchedEffect(Unit) {
            withContext(Dispatchers.IO) {
                items = supabase.from("todos")
                    .select().decodeList<TodoItem>()
            }
        }
        LazyColumn {
            items(
                items,
                key = { item -> item.id },
            ) { item ->
                Text(
                    item.name,
                    modifier = Modifier.padding(8.dp),
                )
            }
        }

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SmartDietPlannerTheme {
        Greeting("Android")
    }
}