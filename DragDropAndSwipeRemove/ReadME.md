
RecyclerView의 요소를 드래그 드롭으로 옮기기 + 옆으로 밀어서 지우기

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
