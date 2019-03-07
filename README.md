# lockableViewPager
Added locking feature to Android ViewPager to stop it from getting commands from user swipe

<img src="preview.gif"
     alt="preview image"
     width="350"
     style=" margin-right: 10px; margin-left : 50px" >
     
 # Adding to your Project

### Step 1. Add the JitPack repository to your build file


Add it in your root build.gradle at the end of repositories:

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
### Step 2. Add the dependency

    dependencies {
	        implementation 'com.github.mr-sarsarabi:lockableViewPager:1.0'
	}
 [![](https://jitpack.io/v/mr-sarsarabi/lockableViewPager.svg)](https://jitpack.io/#mr-sarsarabi/lockableViewPager)

 You can lock the swipe gestures both using Java and Xml.
 
 * #### Xml:
    ```
    <com.mr_sarsarabi.library.LockableViewPager 
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:lock_swipe="true"/>
    ```
 * #### Java:
    ```
    viewPager.setSwipeLocked(true);
    ```

    #### See the sample for more details.
     