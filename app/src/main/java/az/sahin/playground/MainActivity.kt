package az.sahin.playground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "e981d318-5262-488b-b869-465c9bb4e647",
            Analytics::class.java, Crashes::class.java
        )
    }
}