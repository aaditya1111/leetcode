# 182. Duplicate Emails
select Email
from (select Email, count(Email) c from Person group by Email) t
where t.c > 1