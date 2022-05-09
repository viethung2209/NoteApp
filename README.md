(以下の日本語)
# NoteApp
* Tên: Ứng dụng ghi chú 
* HĐH: Android
* Ngôn ngữ: Kotlin
* Chức năng: Thêm, sửa, xoá các ghi chú. Phân loại các ghi chú theo màu. Sắp xếp các ghi chú theo màu, ngày nhập
* Kiến chúc: Clean Architecture
* Các thư viện sử dụng:
 // Compose dependencies
    implementation "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0-beta01"
    implementation "androidx.navigation:navigation-compose:2.4.0-alpha09"
    implementation "androidx.compose.material:material-icons-extended:$compose_version"
    implementation "androidx.hilt:hilt-navigation-compose:1.0.0-alpha03"

    // Coroutines
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1'

    //Dagger - Hilt
    implementation "com.google.dagger:hilt-android:2.38.1"
    kapt "com.google.dagger:hilt-android-compiler:2.37"
    implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    kapt "androidx.hilt:hilt-compiler:1.0.0"

    // Room
    implementation "androidx.room:room-runtime:2.3.0"
    kapt "androidx.room:room-compiler:2.3.0"

    // Kotlin Extensions and Coroutines support for Room
    implementation "androidx.room:room-ktx:2.3.0"
* Một số hình ảnh :
![image](https://user-images.githubusercontent.com/75416674/167452484-22fffa5f-849e-424b-8ff3-b25db8853bf7.png)
![image](https://user-images.githubusercontent.com/75416674/167452510-648e4fce-35e0-4dd4-843d-cf62d4677578.png)
![image](https://user-images.githubusercontent.com/75416674/167452547-d4e065a0-aba2-41a9-aa9c-f1457ec5db15.png)

#ノートアプリ
*名前：Notes App
* OS：Android
*言語：Kotlin
*機能：メモの追加、編集、削除。 メモを色で並べ替えます。 メモを色、入力した日付で並べ替える
*アーキテクチャ：クリーンアーキテクチャ
*使用されるライブラリ：
 // Compose dependencies
    implementation "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0-beta01"
    implementation "androidx.navigation:navigation-compose:2.4.0-alpha09"
    implementation "androidx.compose.material:material-icons-extended:$compose_version"
    implementation "androidx.hilt:hilt-navigation-compose:1.0.0-alpha03"

    // Coroutines
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1'

    //Dagger - Hilt
    implementation "com.google.dagger:hilt-android:2.38.1"
    kapt "com.google.dagger:hilt-android-compiler:2.37"
    implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    kapt "androidx.hilt:hilt-compiler:1.0.0"

    // Room
    implementation "androidx.room:room-runtime:2.3.0"
    kapt "androidx.room:room-compiler:2.3.0"

    // Kotlin Extensions and Coroutines support for Room
    implementation "androidx.room:room-ktx:2.3.0"
