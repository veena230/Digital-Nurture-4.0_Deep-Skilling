BEGIN
    DECLARE
        v_num   NUMBER;
        v_div   NUMBER;
        is_prime BOOLEAN;
    BEGIN
        FOR v_num IN 1..20 LOOP
            is_prime := TRUE;

            IF v_num <= 1 THEN
                is_prime := FALSE;
            ELSE
                v_div := 2;
                WHILE v_div <= SQRT(v_num) LOOP
                    IF MOD(v_num, v_div) = 0 THEN
                        is_prime := FALSE;
                        EXIT;
                    END IF;
                    v_div := v_div + 1;
                END LOOP;
            END IF;

            CASE
                WHEN is_prime THEN
                    DBMS_OUTPUT.PUT_LINE(v_num || ' is a Prime number');
                WHEN MOD(v_num, 2) = 0 THEN
                    DBMS_OUTPUT.PUT_LINE(v_num || ' is Even');
                ELSE
                    DBMS_OUTPUT.PUT_LINE(v_num || ' is Odd');
            END CASE;

            IF MOD(v_num, 3) = 0 AND MOD(v_num, 5) = 0 THEN
                DBMS_OUTPUT.PUT_LINE(v_num || ' is divisible by both 3 and 5.');
                EXIT;
            END IF;
        END LOOP;
    END;
END;
/
