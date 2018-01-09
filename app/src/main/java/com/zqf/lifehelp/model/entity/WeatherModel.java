package com.zqf.lifehelp.model.entity;

import java.util.List;

/**
 * class from
 * Created by zqf
 * Time 2018/1/9 9:47
 */

public class WeatherModel {


    /**
     * msg : success
     * result : [{"airCondition":"良","city":"贵阳","coldIndex":"多发期","date":"2018-01-09","distrct":"贵阳","dressingIndex":"薄冬衣","exerciseIndex":"不适宜","future":[{"date":"2018-01-09","dayTime":"多云","night":"阴","temperature":"4°C / 0°C","week":"今天","wind":"北风 小于3级"},{"date":"2018-01-10","dayTime":"多云","night":"阴","temperature":"5°C / 1°C","week":"星期三","wind":"东风 小于3级"},{"date":"2018-01-11","dayTime":"阴","night":"阴","temperature":"4°C / 1°C","week":"星期四","wind":"南风 小于3级"},{"date":"2018-01-12","dayTime":"阴","night":"小雨","temperature":"5°C / 3°C","week":"星期五","wind":"南风 小于3级"},{"date":"2018-01-13","dayTime":"阴","night":"阴","temperature":"5°C / 3°C","week":"星期六","wind":"南风 小于3级"},{"date":"2018-01-14","dayTime":"阴","night":"阴","temperature":"7°C / 4°C","week":"星期日","wind":"南风 小于3级"},{"date":"2018-01-15","dayTime":"多云","night":"阵雨","temperature":"11°C / 6°C","week":"星期一","wind":"南风 4级"},{"date":"2018-01-16","dayTime":"零散阵雨","night":"零散阵雨","temperature":"12°C / 6°C","week":"星期二","wind":"西北偏北风 2级"},{"date":"2018-01-17","dayTime":"零散阵雨","night":"阵雨","temperature":"15°C / 8°C","week":"星期三","wind":"南风 4级"},{"date":"2018-01-18","dayTime":"阵雨","night":"阵雨","temperature":"11°C / 6°C","week":"星期四","wind":"北风 3级"}],"humidity":"湿度：85%","pollutionIndex":"64","province":"贵州","sunrise":"07:43","sunset":"18:17","temperature":"-1℃","time":"09:12","updateTime":"20180109092124","washIndex":"不太适宜","weather":"晴","week":"周二","wind":"西北风2级"}]
     * retCode : 200
     */

    private String msg;
    private String retCode;
    private List<ResultBean> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * airCondition : 良
         * city : 贵阳
         * coldIndex : 多发期
         * date : 2018-01-09
         * distrct : 贵阳
         * dressingIndex : 薄冬衣
         * exerciseIndex : 不适宜
         * future : [{"date":"2018-01-09","dayTime":"多云","night":"阴","temperature":"4°C / 0°C","week":"今天","wind":"北风 小于3级"},{"date":"2018-01-10","dayTime":"多云","night":"阴","temperature":"5°C / 1°C","week":"星期三","wind":"东风 小于3级"},{"date":"2018-01-11","dayTime":"阴","night":"阴","temperature":"4°C / 1°C","week":"星期四","wind":"南风 小于3级"},{"date":"2018-01-12","dayTime":"阴","night":"小雨","temperature":"5°C / 3°C","week":"星期五","wind":"南风 小于3级"},{"date":"2018-01-13","dayTime":"阴","night":"阴","temperature":"5°C / 3°C","week":"星期六","wind":"南风 小于3级"},{"date":"2018-01-14","dayTime":"阴","night":"阴","temperature":"7°C / 4°C","week":"星期日","wind":"南风 小于3级"},{"date":"2018-01-15","dayTime":"多云","night":"阵雨","temperature":"11°C / 6°C","week":"星期一","wind":"南风 4级"},{"date":"2018-01-16","dayTime":"零散阵雨","night":"零散阵雨","temperature":"12°C / 6°C","week":"星期二","wind":"西北偏北风 2级"},{"date":"2018-01-17","dayTime":"零散阵雨","night":"阵雨","temperature":"15°C / 8°C","week":"星期三","wind":"南风 4级"},{"date":"2018-01-18","dayTime":"阵雨","night":"阵雨","temperature":"11°C / 6°C","week":"星期四","wind":"北风 3级"}]
         * humidity : 湿度：85%
         * pollutionIndex : 64
         * province : 贵州
         * sunrise : 07:43
         * sunset : 18:17
         * temperature : -1℃
         * time : 09:12
         * updateTime : 20180109092124
         * washIndex : 不太适宜
         * weather : 晴
         * week : 周二
         * wind : 西北风2级
         */

        private String airCondition;
        private String city;
        private String coldIndex;
        private String date;
        private String distrct;
        private String dressingIndex;
        private String exerciseIndex;
        private String humidity;
        private String pollutionIndex;
        private String province;
        private String sunrise;
        private String sunset;
        private String temperature;
        private String time;
        private String updateTime;
        private String washIndex;
        private String weather;
        private String week;
        private String wind;
        private List<FutureBean> future;

        public String getAirCondition() {
            return airCondition;
        }

        public void setAirCondition(String airCondition) {
            this.airCondition = airCondition;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getColdIndex() {
            return coldIndex;
        }

        public void setColdIndex(String coldIndex) {
            this.coldIndex = coldIndex;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDistrct() {
            return distrct;
        }

        public void setDistrct(String distrct) {
            this.distrct = distrct;
        }

        public String getDressingIndex() {
            return dressingIndex;
        }

        public void setDressingIndex(String dressingIndex) {
            this.dressingIndex = dressingIndex;
        }

        public String getExerciseIndex() {
            return exerciseIndex;
        }

        public void setExerciseIndex(String exerciseIndex) {
            this.exerciseIndex = exerciseIndex;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getPollutionIndex() {
            return pollutionIndex;
        }

        public void setPollutionIndex(String pollutionIndex) {
            this.pollutionIndex = pollutionIndex;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getWashIndex() {
            return washIndex;
        }

        public void setWashIndex(String washIndex) {
            this.washIndex = washIndex;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getWind() {
            return wind;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }

        public List<FutureBean> getFuture() {
            return future;
        }

        public void setFuture(List<FutureBean> future) {
            this.future = future;
        }

        public static class FutureBean {
            /**
             * date : 2018-01-09
             * dayTime : 多云
             * night : 阴
             * temperature : 4°C / 0°C
             * week : 今天
             * wind : 北风 小于3级
             */

            private String date;
            private String dayTime;
            private String night;
            private String temperature;
            private String week;
            private String wind;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDayTime() {
                return dayTime;
            }

            public void setDayTime(String dayTime) {
                this.dayTime = dayTime;
            }

            public String getNight() {
                return night;
            }

            public void setNight(String night) {
                this.night = night;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            @Override
            public String toString() {
                return "FutureBean{" +
                        "date='" + date + '\'' +
                        ", dayTime='" + dayTime + '\'' +
                        ", night='" + night + '\'' +
                        ", temperature='" + temperature + '\'' +
                        ", week='" + week + '\'' +
                        ", wind='" + wind + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "airCondition='" + airCondition + '\'' +
                    ", city='" + city + '\'' +
                    ", coldIndex='" + coldIndex + '\'' +
                    ", date='" + date + '\'' +
                    ", distrct='" + distrct + '\'' +
                    ", dressingIndex='" + dressingIndex + '\'' +
                    ", exerciseIndex='" + exerciseIndex + '\'' +
                    ", humidity='" + humidity + '\'' +
                    ", pollutionIndex='" + pollutionIndex + '\'' +
                    ", province='" + province + '\'' +
                    ", sunrise='" + sunrise + '\'' +
                    ", sunset='" + sunset + '\'' +
                    ", temperature='" + temperature + '\'' +
                    ", time='" + time + '\'' +
                    ", updateTime='" + updateTime + '\'' +
                    ", washIndex='" + washIndex + '\'' +
                    ", weather='" + weather + '\'' +
                    ", week='" + week + '\'' +
                    ", wind='" + wind + '\'' +
                    ", future=" + future +
                    '}';
        }

    }

    @Override
    public String toString() {
        return "WeatherModel{" +
                "msg='" + msg + '\'' +
                ", retCode='" + retCode + '\'' +
                ", result=" + result +
                '}';
    }
}
