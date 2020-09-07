# NavigationComponents

## General Info
Navigation components is the library that simplifies the navigation, Deeplink issues and back stack problems in Android development
We can set all the animations for the each transactions, pass bundles between the destinations.

## Gradle Dependency
def nav_version = "2.3.0"
implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
implementation "androidx.navigation:navigation-ui-ktx:$nav_version"


## Why to add Safe Args

```
To add Safe Args to your project, include the following classpath in your top level build.gradle file
def nav_version = "2.3.0"
classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
```

## Key Points
* # Navigation Graph - 
    Resource file and Combination of Destinations and Actions
* # Destination -
    It may be of Fragments and Activity to which transaction will occur.   
* # Action -
     Logical connection between the destinations. Where the arrow indicates From and To between the destination.     
* # Arguments -
     Initiating the data to be passed from one destination to another     
* # NavHost -
     One of the core parts of the Navigation component is the navigation host. The navigation host is an empty container where destinations are swapped in and out as a user navigates through your app.
     
## Navigate to a destination 
  * Fragment.findNavController()
  * View.findNavController()
  * Activity.findNavController(viewId: Int)
  
## Key Attributes mentioned in Actions 
  popuptoInclusive - clears all the history in the stack
  Popupto - navigates back to the specific fragment

  enterAnim - while entering the destination
  exitAnim - while exiting the destination
  
  PopEnterAnim - while enter and poping the destination
  popExitAnim - while exit and poping the destination

  app:startDestination="@id/fifthFragment"
  Denotes which fragment should be displayed initially in the specific Navhost.
  Eg : app:defaultNavHost="true"
       app:navGraph="@navigation/nav_graph"
       
  
  ## Steps to implement DeepLink
  Add below lines in the Manifest which activity is to be opened
  ```
  <activity android:name=".activity.SecondActivity">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />

        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
    <nav-graph android:value="@navigation/second_nav_host" />
  </activity>
  ```

  # Example of adding below lines in Nav_host

```
 <fragment
    android:id="@+id/fourthFragment2"
    android:name="com.example.navigationcomponents.fragment.FourthFragment"
    android:label="fragment_fourth"
    tools:layout="@layout/fragment_fourth">
    <action
        android:id="@+id/action_fourthFragment2_to_sixthFragment"
        app:destination="@id/sixthFragment"
        app:enterAnim="@anim/fade_in"
        app:exitAnim="@anim/fade_out" />
    <deepLink
        android:id="@+id/deepLink"
        android:autoVerify="true"
        app:uri="www.chibi.com" />
</fragment>
```

# GIF App Flow
<img src="https://github.com/chibiragu94/NavigationComponents/blob/master/navigation_component.gif" width="400" height="600">

# Nav host Graph 
<img src="https://github.com/chibiragu94/NavigationComponents/blob/master/Screenshot%202020-09-07%20at%206.13.45%20PM.png" width="900" height="500">
<img src="https://github.com/chibiragu94/NavigationComponents/blob/master/Screenshot%202020-09-07%20at%206.13.57%20PM.png" width="900" height="500">

     
     
     
     
     

