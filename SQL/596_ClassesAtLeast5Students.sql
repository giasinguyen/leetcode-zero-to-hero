SELECT class
FROM (
    SELECT class, COUNT(*) AS class_count
    FROM Courses
    GROUP BY class
) AS subquery
WHERE class_count >= 5;
