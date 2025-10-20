TRUNCATE TABLE exercise CASCADE;
ALTER SEQUENCE exercise_id_seq RESTART WITH 1;
TRUNCATE TABLE workout CASCADE;
ALTER SEQUENCE workout_id_seq RESTART WITH 1;
TRUNCATE TABLE meal CASCADE;
ALTER SEQUENCE meal_id_seq RESTART WITH 1;
TRUNCATE TABLE bodymeasurement CASCADE;
ALTER SEQUENCE bodymeasurement_id_seq RESTART WITH 1;
TRUNCATE TABLE usergym CASCADE;
ALTER SEQUENCE usergym_id_seq RESTART WITH 1;

-- ============================
-- TABLE : users
-- ============================
INSERT INTO usergym (username, password, email, age, weight, height, gender, goal, roles)
VALUES
    ('john_doe', 'password123', 'john@example.com', 28, 75.0, 1.78, 'HOMME', 'PRISE_DE_MASSE', 'USER'),
    ( 'jane_smith', 'securepass', 'jane@example.com', 25, 60.0, 1.65, 'FEMME', 'PRISE_DE_MASSE', 'USER'),
    ('mike_brown', 'pass1234', 'mike@example.com', 32, 82.5, 1.82, 'HOMME', 'SECHE', 'USER'),
    ('sara_white', 'sara2025', 'sara@example.com', 29, 68.0, 1.70, 'FEMME', 'PRISE_DE_MASSE', 'USER'),
    ('alex_green', 'alexfit', 'alex@example.com', 35, 90.0, 1.85, 'HOMME', 'SECHE', 'USER');

-- ============================
-- TABLE : workouts
-- ============================
INSERT INTO workout (date, type, notes, user_id)
VALUES
    ('2025-09-01', 'MUSCU', 'Chest and triceps', 1),
    ('2025-09-03', 'CARDIO', 'Treadmill session', 2),
    ('2025-09-05', 'MIXTE', 'Full body workout', 3),
    ('2025-09-07', 'CARDIO', 'Legs and back', 4),
    ('2025-09-09', 'MIXTE', 'Cycling session', 5);

-- ============================
-- TABLE : exercises
-- ============================
INSERT INTO exercise (name, muscle_group, sets, reps, weight, workout_id)
VALUES
    ('Bench Press', 'PECS', 4, 10, 60.0, 1),
    ('Triceps Dips', 'BRAS', 3, 12, 0.0, 1),
    ('Treadmill', 'JAMBES', 1, 30, 0.0, 2),
    ('Burpees', 'JAMBES', 4, 15, 0.0, 3),
    ('Squats', 'JAMBES', 4, 12, 80.0, 4),
    ('Cycling', 'JAMBES', 1, 40, 0.0, 5);

-- ============================
-- TABLE : body_measurements
-- ============================
INSERT INTO bodymeasurement (date, weight, body_fat_percentage, chest, waist, arms, user_id)
VALUES
    ('2025-09-01', 75.0, 15.5, 95.0, 82.0, 32.0, 1),
    ('2025-09-02', 60.5, 20.0, 85.0, 72.0, 28.0, 2),
    ('2025-09-03', 82.0, 18.0, 100.0, 88.0, 35.0, 3),
    ('2025-09-04', 68.0, 22.0, 90.0, 74.0, 30.0, 4),
    ('2025-09-05', 90.0, 17.5, 105.0, 92.0, 37.0, 5);

-- ============================
-- TABLE : meals
-- ============================
INSERT INTO meal (name, date, calories, protein, carbs, fats, user_id)
VALUES
    ('Breakfast - Oatmeal with Fruits', '2025-09-01', 450.0, 20.0, 60.0, 12.0, 1),
    ('Lunch - Grilled Chicken Salad', '2025-09-01', 550.0, 40.0, 30.0, 18.0, 2),
    ('Snack - Protein Shake', '2025-09-02', 200.0, 25.0, 10.0, 5.0, 3),
    ('Dinner - Salmon with Rice and Veggies', '2025-09-02', 650.0, 45.0, 50.0, 22.0, 4),
    ('Post-Workout Shake', '2025-09-03', 300.0, 30.0, 20.0, 6.0, 5);
