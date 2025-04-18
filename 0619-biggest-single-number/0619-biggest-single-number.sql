SELECT MAX(num) AS num from MyNumbers
where num in (
SELECT num
FROM MyNumbers
GROUP BY num
HAVING COUNT(*) = 1
ORDER BY num DESC
)