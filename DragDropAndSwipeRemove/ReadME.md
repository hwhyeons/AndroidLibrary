
RecyclerView의 요소를 드래그 드롭으로 옮기기 + 옆으로 밀어서 지우기

build.gradle
```groovy
implementation 'androidx.recyclerview:recyclerview:1.2.1'
```


리사이클러뷰 띄울 XML (activity_main.xml)
```xml
<androidx.recyclerview.widget.RecyclerView
  android:id="@+id/recycler_view"
  android:layout_marginTop="10dp"
  android:layout_weight="3"
  android:layout_width="match_parent"
  android:layout_height="match_parent" />
```


메인 액티비티
```java
List<String> arr = new ArrayList<>();
arr.add("One");
arr.add("Two");
arr.add("Three");
arr.add("Four");
arr.add("Five");
RecyclerView recyclerView = findViewById(R.id.recycler_view);
recyclerView.setHasFixedSize(true);
recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
RecyclerListAdapter adapter = new RecyclerListAdapter(arr);
recyclerView.setAdapter(adapter);
ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapter);
ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
touchHelper.attachToRecyclerView(recyclerView);
```


출처
https://gist.github.com/iPaulPro/2216ea5e14818056cfcc#file-recyclerlistadapter-java
