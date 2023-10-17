select query_name, round(avg(rating/Queries.position),2) as quality ,(round((sum(rating<3)/count(*))*100,2)) as poor_query_percentage 
 from queries
group by query_na
