CREATE TABLE admin (
 admin_id integer PRIMARY KEY,
 time_id integer NOT NULL UNIQUE,
 team_name text NOT NULL,
 team_manager text NOT NULL 
);

CREATE TABLE setting (
 setting_id integer PRIMARY KEY,
 setting_year text NOT NULL UNIQUE,
 expiration_pay_date text NOT NULL,
 reward_percent real NOT NULL,
 party_percent real NOT NULL,
 intermediate_reward_percent real NOT NULL,
 general_reward_percent real NOT NULL
);

CREATE TABLE reward_percent (
 reward_id integer PRIMARY KEY,
 description text NOT NULL UNIQUE,
 type text NOT NULL,
 percent real NOT NULL
);

CREATE TABLE payment_register (
 payment_register_id integer PRIMARY KEY,
 time_id integer NOT NULL UNIQUE,
 team_name text NOT NULL,
 team_manager text NOT NULL,
 payed integer NOT NULL
);