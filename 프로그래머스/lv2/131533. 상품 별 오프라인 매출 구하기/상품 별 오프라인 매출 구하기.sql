# -- 코드를 입력하세요
SELECT A.PRODUCT_CODE, SUM(B.SALES_AMOUNT) * A.PRICE AS SALES
FROM PRODUCT A
JOIN OFFLINE_SALE B
ON A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY A.PRODUCT_ID
ORDER BY SALES DESC, A.PRODUCT_CODE

