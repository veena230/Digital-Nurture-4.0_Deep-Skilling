import React from 'react';

function App() {
  const courses = ['React', 'Node.js', 'Python', 'ML', 'Data Science'];

  return (
    <div>
      <h2>Available Courses</h2>
      <ul>
        {courses.map((course, index) => (
          <li key={index}>{course}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
