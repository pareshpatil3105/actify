


-- query to find out top 5 customer based on average transaction amount.
 SELECT id, name, avg(txn_amount) FROM actify.customer group by name limit 0,5   ;

-- YTD - From 1st April of previous year till date
 select count(*) from customer where created_date>='2020-04-01 00:00:00';

-- query for CMCY - Current Month and Current Year
  select count(*) from customer where month(created_date)=month(now()) and year(created_date)=year(now()) ;
 
-- query for CMLY - Current Month and Last Year
  select count(*) from customer where month(created_date)= month(now()) and year(created_date)=year(DATE_SUB(curdate(), INTERVAL 1 YEAR));
 

-- query for LYTD - YTD of last year 
  select count(*) from customer where year(created_date) > year(DATE_SUB(curdate(), INTERVAL 1 YEAR));
 
-- query to get last 2 months inactive customers
 select count(*) from customer where month(created_date)<=month(DATE_SUB(curdate() , INTERVAL 2 MONTH));
 
-- query customers whose birthday is in the current week
select name from customer where week(created_date)= week(now());

